const express = require("express");
const router = express.Router();
const runValidation = require("../validators/index.middleware");

const { authentication } = require("../validators/auth.middleware");
const { registerValidator, updateUserValidator } = require("../validators/auth.validator");
const { idInParams, paginationValidator } = require("../validators/utils.validator")
const authController = require("../controllers/auth.controller");

router.post("/register", registerValidator, runValidation, authController.register);
router.post("/login", authController.login);
router.get("/aboutMe", authentication, runValidation,authController.aboutMe);
router.get("/:id", idInParams, runValidation, authController.findOneUser);
router.get("/", paginationValidator, runValidation, authController.findAll);
router.patch("/", authentication, updateUserValidator, runValidation, authController.updateUser);
router.patch("/password/", authentication, updateUserValidator, runValidation, authController.changePassword);
router.patch("/wishlist/:id", authentication, idInParams, runValidation, authController.editWishlist);

module.exports = router;