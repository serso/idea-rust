package org.solovyev.idea.rust;// Generated from Rust.g4 by ANTLR 4.5
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RustParser}.
 */
public interface RustListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RustParser#tts}.
	 * @param ctx the parse tree
	 */
	void enterTts(RustParser.TtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#tts}.
	 * @param ctx the parse tree
	 */
	void exitTts(RustParser.TtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RustParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RustParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#module_contents}.
	 * @param ctx the parse tree
	 */
	void enterModule_contents(RustParser.Module_contentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#module_contents}.
	 * @param ctx the parse tree
	 */
	void exitModule_contents(RustParser.Module_contentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#extern_mod_view_item}.
	 * @param ctx the parse tree
	 */
	void enterExtern_mod_view_item(RustParser.Extern_mod_view_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#extern_mod_view_item}.
	 * @param ctx the parse tree
	 */
	void exitExtern_mod_view_item(RustParser.Extern_mod_view_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#view_item}.
	 * @param ctx the parse tree
	 */
	void enterView_item(RustParser.View_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#view_item}.
	 * @param ctx the parse tree
	 */
	void exitView_item(RustParser.View_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#mod_item}.
	 * @param ctx the parse tree
	 */
	void enterMod_item(RustParser.Mod_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#mod_item}.
	 * @param ctx the parse tree
	 */
	void exitMod_item(RustParser.Mod_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#mod_decl}.
	 * @param ctx the parse tree
	 */
	void enterMod_decl(RustParser.Mod_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#mod_decl}.
	 * @param ctx the parse tree
	 */
	void exitMod_decl(RustParser.Mod_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#foreign_mod}.
	 * @param ctx the parse tree
	 */
	void enterForeign_mod(RustParser.Foreign_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#foreign_mod}.
	 * @param ctx the parse tree
	 */
	void exitForeign_mod(RustParser.Foreign_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#foreign_item}.
	 * @param ctx the parse tree
	 */
	void enterForeign_item(RustParser.Foreign_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#foreign_item}.
	 * @param ctx the parse tree
	 */
	void exitForeign_item(RustParser.Foreign_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(RustParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(RustParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#struct_decl}.
	 * @param ctx the parse tree
	 */
	void enterStruct_decl(RustParser.Struct_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#struct_decl}.
	 * @param ctx the parse tree
	 */
	void exitStruct_decl(RustParser.Struct_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#struct_fields}.
	 * @param ctx the parse tree
	 */
	void enterStruct_fields(RustParser.Struct_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#struct_fields}.
	 * @param ctx the parse tree
	 */
	void exitStruct_fields(RustParser.Struct_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#struct_field}.
	 * @param ctx the parse tree
	 */
	void enterStruct_field(RustParser.Struct_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#struct_field}.
	 * @param ctx the parse tree
	 */
	void exitStruct_field(RustParser.Struct_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_decl}.
	 * @param ctx the parse tree
	 */
	void enterEnum_decl(RustParser.Enum_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_decl}.
	 * @param ctx the parse tree
	 */
	void exitEnum_decl(RustParser.Enum_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_variant_decls}.
	 * @param ctx the parse tree
	 */
	void enterEnum_variant_decls(RustParser.Enum_variant_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_variant_decls}.
	 * @param ctx the parse tree
	 */
	void exitEnum_variant_decls(RustParser.Enum_variant_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_variant_decl}.
	 * @param ctx the parse tree
	 */
	void enterEnum_variant_decl(RustParser.Enum_variant_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_variant_decl}.
	 * @param ctx the parse tree
	 */
	void exitEnum_variant_decl(RustParser.Enum_variant_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#trait_decl}.
	 * @param ctx the parse tree
	 */
	void enterTrait_decl(RustParser.Trait_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#trait_decl}.
	 * @param ctx the parse tree
	 */
	void exitTrait_decl(RustParser.Trait_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#trait_method}.
	 * @param ctx the parse tree
	 */
	void enterTrait_method(RustParser.Trait_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#trait_method}.
	 * @param ctx the parse tree
	 */
	void exitTrait_method(RustParser.Trait_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#impl}.
	 * @param ctx the parse tree
	 */
	void enterImpl(RustParser.ImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#impl}.
	 * @param ctx the parse tree
	 */
	void exitImpl(RustParser.ImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#impl_trait_for_type}.
	 * @param ctx the parse tree
	 */
	void enterImpl_trait_for_type(RustParser.Impl_trait_for_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#impl_trait_for_type}.
	 * @param ctx the parse tree
	 */
	void exitImpl_trait_for_type(RustParser.Impl_trait_for_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#impl_body}.
	 * @param ctx the parse tree
	 */
	void enterImpl_body(RustParser.Impl_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#impl_body}.
	 * @param ctx the parse tree
	 */
	void exitImpl_body(RustParser.Impl_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#impl_method}.
	 * @param ctx the parse tree
	 */
	void enterImpl_method(RustParser.Impl_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#impl_method}.
	 * @param ctx the parse tree
	 */
	void exitImpl_method(RustParser.Impl_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#item_fn_decl}.
	 * @param ctx the parse tree
	 */
	void enterItem_fn_decl(RustParser.Item_fn_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#item_fn_decl}.
	 * @param ctx the parse tree
	 */
	void exitItem_fn_decl(RustParser.Item_fn_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#fun_body}.
	 * @param ctx the parse tree
	 */
	void enterFun_body(RustParser.Fun_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#fun_body}.
	 * @param ctx the parse tree
	 */
	void exitFun_body(RustParser.Fun_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RustParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RustParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#block_element}.
	 * @param ctx the parse tree
	 */
	void enterBlock_element(RustParser.Block_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#block_element}.
	 * @param ctx the parse tree
	 */
	void exitBlock_element(RustParser.Block_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#block_last_element}.
	 * @param ctx the parse tree
	 */
	void enterBlock_last_element(RustParser.Block_last_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#block_last_element}.
	 * @param ctx the parse tree
	 */
	void exitBlock_last_element(RustParser.Block_last_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ret_ty}.
	 * @param ctx the parse tree
	 */
	void enterRet_ty(RustParser.Ret_tyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ret_ty}.
	 * @param ctx the parse tree
	 */
	void exitRet_ty(RustParser.Ret_tyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#macro_item}.
	 * @param ctx the parse tree
	 */
	void enterMacro_item(RustParser.Macro_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#macro_item}.
	 * @param ctx the parse tree
	 */
	void exitMacro_item(RustParser.Macro_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#attrs_and_vis}.
	 * @param ctx the parse tree
	 */
	void enterAttrs_and_vis(RustParser.Attrs_and_visContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#attrs_and_vis}.
	 * @param ctx the parse tree
	 */
	void exitAttrs_and_vis(RustParser.Attrs_and_visContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(RustParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(RustParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#mutability}.
	 * @param ctx the parse tree
	 */
	void enterMutability(RustParser.MutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#mutability}.
	 * @param ctx the parse tree
	 */
	void exitMutability(RustParser.MutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lib_selectors}.
	 * @param ctx the parse tree
	 */
	void enterLib_selectors(RustParser.Lib_selectorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lib_selectors}.
	 * @param ctx the parse tree
	 */
	void exitLib_selectors(RustParser.Lib_selectorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#outer_attrs}.
	 * @param ctx the parse tree
	 */
	void enterOuter_attrs(RustParser.Outer_attrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#outer_attrs}.
	 * @param ctx the parse tree
	 */
	void exitOuter_attrs(RustParser.Outer_attrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#outer_attr}.
	 * @param ctx the parse tree
	 */
	void enterOuter_attr(RustParser.Outer_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#outer_attr}.
	 * @param ctx the parse tree
	 */
	void exitOuter_attr(RustParser.Outer_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#inner_attr}.
	 * @param ctx the parse tree
	 */
	void enterInner_attr(RustParser.Inner_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#inner_attr}.
	 * @param ctx the parse tree
	 */
	void exitInner_attr(RustParser.Inner_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#meta_item}.
	 * @param ctx the parse tree
	 */
	void enterMeta_item(RustParser.Meta_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#meta_item}.
	 * @param ctx the parse tree
	 */
	void exitMeta_item(RustParser.Meta_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#meta_items}.
	 * @param ctx the parse tree
	 */
	void enterMeta_items(RustParser.Meta_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#meta_items}.
	 * @param ctx the parse tree
	 */
	void exitMeta_items(RustParser.Meta_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(RustParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(RustParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(RustParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(RustParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#arg_mode}.
	 * @param ctx the parse tree
	 */
	void enterArg_mode(RustParser.Arg_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#arg_mode}.
	 * @param ctx the parse tree
	 */
	void exitArg_mode(RustParser.Arg_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#obsoletemode}.
	 * @param ctx the parse tree
	 */
	void enterObsoletemode(RustParser.ObsoletemodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#obsoletemode}.
	 * @param ctx the parse tree
	 */
	void exitObsoletemode(RustParser.ObsoletemodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#self_ty_and_args}.
	 * @param ctx the parse tree
	 */
	void enterSelf_ty_and_args(RustParser.Self_ty_and_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#self_ty_and_args}.
	 * @param ctx the parse tree
	 */
	void exitSelf_ty_and_args(RustParser.Self_ty_and_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#self_ty_and_maybenamed_args}.
	 * @param ctx the parse tree
	 */
	void enterSelf_ty_and_maybenamed_args(RustParser.Self_ty_and_maybenamed_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#self_ty_and_maybenamed_args}.
	 * @param ctx the parse tree
	 */
	void exitSelf_ty_and_maybenamed_args(RustParser.Self_ty_and_maybenamed_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#self_ty}.
	 * @param ctx the parse tree
	 */
	void enterSelf_ty(RustParser.Self_tyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#self_ty}.
	 * @param ctx the parse tree
	 */
	void exitSelf_ty(RustParser.Self_tyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#maybetyped_args}.
	 * @param ctx the parse tree
	 */
	void enterMaybetyped_args(RustParser.Maybetyped_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#maybetyped_args}.
	 * @param ctx the parse tree
	 */
	void exitMaybetyped_args(RustParser.Maybetyped_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#maybetyped_arg}.
	 * @param ctx the parse tree
	 */
	void enterMaybetyped_arg(RustParser.Maybetyped_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#maybetyped_arg}.
	 * @param ctx the parse tree
	 */
	void exitMaybetyped_arg(RustParser.Maybetyped_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#maybenamed_args}.
	 * @param ctx the parse tree
	 */
	void enterMaybenamed_args(RustParser.Maybenamed_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#maybenamed_args}.
	 * @param ctx the parse tree
	 */
	void exitMaybenamed_args(RustParser.Maybenamed_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#maybenamed_arg}.
	 * @param ctx the parse tree
	 */
	void enterMaybenamed_arg(RustParser.Maybenamed_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#maybenamed_arg}.
	 * @param ctx the parse tree
	 */
	void exitMaybenamed_arg(RustParser.Maybenamed_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterPat(RustParser.PatContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitPat(RustParser.PatContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pats}.
	 * @param ctx the parse tree
	 */
	void enterPats(RustParser.PatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pats}.
	 * @param ctx the parse tree
	 */
	void exitPats(RustParser.PatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pats_or}.
	 * @param ctx the parse tree
	 */
	void enterPats_or(RustParser.Pats_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pats_or}.
	 * @param ctx the parse tree
	 */
	void exitPats_or(RustParser.Pats_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#vec_pats}.
	 * @param ctx the parse tree
	 */
	void enterVec_pats(RustParser.Vec_patsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#vec_pats}.
	 * @param ctx the parse tree
	 */
	void exitVec_pats(RustParser.Vec_patsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#vec_pats_no_slice}.
	 * @param ctx the parse tree
	 */
	void enterVec_pats_no_slice(RustParser.Vec_pats_no_sliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#vec_pats_no_slice}.
	 * @param ctx the parse tree
	 */
	void exitVec_pats_no_slice(RustParser.Vec_pats_no_sliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#const_item}.
	 * @param ctx the parse tree
	 */
	void enterConst_item(RustParser.Const_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#const_item}.
	 * @param ctx the parse tree
	 */
	void exitConst_item(RustParser.Const_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#view_paths}.
	 * @param ctx the parse tree
	 */
	void enterView_paths(RustParser.View_pathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#view_paths}.
	 * @param ctx the parse tree
	 */
	void exitView_paths(RustParser.View_pathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#view_path}.
	 * @param ctx the parse tree
	 */
	void enterView_path(RustParser.View_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#view_path}.
	 * @param ctx the parse tree
	 */
	void exitView_path(RustParser.View_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_fields}.
	 * @param ctx the parse tree
	 */
	void enterPat_fields(RustParser.Pat_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_fields}.
	 * @param ctx the parse tree
	 */
	void exitPat_fields(RustParser.Pat_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#traits}.
	 * @param ctx the parse tree
	 */
	void enterTraits(RustParser.TraitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#traits}.
	 * @param ctx the parse tree
	 */
	void exitTraits(RustParser.TraitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#trait}.
	 * @param ctx the parse tree
	 */
	void enterTrait(RustParser.TraitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#trait}.
	 * @param ctx the parse tree
	 */
	void exitTrait(RustParser.TraitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#tys}.
	 * @param ctx the parse tree
	 */
	void enterTys(RustParser.TysContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#tys}.
	 * @param ctx the parse tree
	 */
	void exitTys(RustParser.TysContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty}.
	 * @param ctx the parse tree
	 */
	void enterTy(RustParser.TyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty}.
	 * @param ctx the parse tree
	 */
	void exitTy(RustParser.TyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#box_or_uniq_pointee}.
	 * @param ctx the parse tree
	 */
	void enterBox_or_uniq_pointee(RustParser.Box_or_uniq_pointeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#box_or_uniq_pointee}.
	 * @param ctx the parse tree
	 */
	void exitBox_or_uniq_pointee(RustParser.Box_or_uniq_pointeeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#borrowed_pointee}.
	 * @param ctx the parse tree
	 */
	void enterBorrowed_pointee(RustParser.Borrowed_pointeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#borrowed_pointee}.
	 * @param ctx the parse tree
	 */
	void exitBorrowed_pointee(RustParser.Borrowed_pointeeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_closure}.
	 * @param ctx the parse tree
	 */
	void enterTy_closure(RustParser.Ty_closureContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_closure}.
	 * @param ctx the parse tree
	 */
	void exitTy_closure(RustParser.Ty_closureContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_fn}.
	 * @param ctx the parse tree
	 */
	void enterTy_fn(RustParser.Ty_fnContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_fn}.
	 * @param ctx the parse tree
	 */
	void exitTy_fn(RustParser.Ty_fnContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#obsoleteconst}.
	 * @param ctx the parse tree
	 */
	void enterObsoleteconst(RustParser.ObsoleteconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#obsoleteconst}.
	 * @param ctx the parse tree
	 */
	void exitObsoleteconst(RustParser.ObsoleteconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#stmt_not_just_expr}.
	 * @param ctx the parse tree
	 */
	void enterStmt_not_just_expr(RustParser.Stmt_not_just_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#stmt_not_just_expr}.
	 * @param ctx the parse tree
	 */
	void exitStmt_not_just_expr(RustParser.Stmt_not_just_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#let_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLet_stmt(RustParser.Let_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#let_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLet_stmt(RustParser.Let_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#local_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterLocal_var_decl(RustParser.Local_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#local_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitLocal_var_decl(RustParser.Local_var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#generic_decls}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_decls(RustParser.Generic_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#generic_decls}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_decls(RustParser.Generic_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_params}.
	 * @param ctx the parse tree
	 */
	void enterTy_params(RustParser.Ty_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_params}.
	 * @param ctx the parse tree
	 */
	void exitTy_params(RustParser.Ty_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_param}.
	 * @param ctx the parse tree
	 */
	void enterTy_param(RustParser.Ty_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_param}.
	 * @param ctx the parse tree
	 */
	void exitTy_param(RustParser.Ty_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#boundseq}.
	 * @param ctx the parse tree
	 */
	void enterBoundseq(RustParser.BoundseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#boundseq}.
	 * @param ctx the parse tree
	 */
	void exitBoundseq(RustParser.BoundseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#bound}.
	 * @param ctx the parse tree
	 */
	void enterBound(RustParser.BoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#bound}.
	 * @param ctx the parse tree
	 */
	void exitBound(RustParser.BoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#obsoletekind}.
	 * @param ctx the parse tree
	 */
	void enterObsoletekind(RustParser.ObsoletekindContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#obsoletekind}.
	 * @param ctx the parse tree
	 */
	void exitObsoletekind(RustParser.ObsoletekindContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#generics}.
	 * @param ctx the parse tree
	 */
	void enterGenerics(RustParser.GenericsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#generics}.
	 * @param ctx the parse tree
	 */
	void exitGenerics(RustParser.GenericsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lifetimes_in_braces}.
	 * @param ctx the parse tree
	 */
	void enterLifetimes_in_braces(RustParser.Lifetimes_in_bracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lifetimes_in_braces}.
	 * @param ctx the parse tree
	 */
	void exitLifetimes_in_braces(RustParser.Lifetimes_in_bracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lifetimes}.
	 * @param ctx the parse tree
	 */
	void enterLifetimes(RustParser.LifetimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lifetimes}.
	 * @param ctx the parse tree
	 */
	void exitLifetimes(RustParser.LifetimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#idents}.
	 * @param ctx the parse tree
	 */
	void enterIdents(RustParser.IdentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#idents}.
	 * @param ctx the parse tree
	 */
	void exitIdents(RustParser.IdentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(RustParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(RustParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#non_global_path}.
	 * @param ctx the parse tree
	 */
	void enterNon_global_path(RustParser.Non_global_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#non_global_path}.
	 * @param ctx the parse tree
	 */
	void exitNon_global_path(RustParser.Non_global_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(RustParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(RustParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RustParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RustParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_1}.
	 * @param ctx the parse tree
	 */
	void enterExpr_1(RustParser.Expr_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_1}.
	 * @param ctx the parse tree
	 */
	void exitExpr_1(RustParser.Expr_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_2}.
	 * @param ctx the parse tree
	 */
	void enterExpr_2(RustParser.Expr_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_2}.
	 * @param ctx the parse tree
	 */
	void exitExpr_2(RustParser.Expr_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_3}.
	 * @param ctx the parse tree
	 */
	void enterExpr_3(RustParser.Expr_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_3}.
	 * @param ctx the parse tree
	 */
	void exitExpr_3(RustParser.Expr_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_4}.
	 * @param ctx the parse tree
	 */
	void enterExpr_4(RustParser.Expr_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_4}.
	 * @param ctx the parse tree
	 */
	void exitExpr_4(RustParser.Expr_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_5}.
	 * @param ctx the parse tree
	 */
	void enterExpr_5(RustParser.Expr_5Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_5}.
	 * @param ctx the parse tree
	 */
	void exitExpr_5(RustParser.Expr_5Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_6}.
	 * @param ctx the parse tree
	 */
	void enterExpr_6(RustParser.Expr_6Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_6}.
	 * @param ctx the parse tree
	 */
	void exitExpr_6(RustParser.Expr_6Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_7}.
	 * @param ctx the parse tree
	 */
	void enterExpr_7(RustParser.Expr_7Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_7}.
	 * @param ctx the parse tree
	 */
	void exitExpr_7(RustParser.Expr_7Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_8}.
	 * @param ctx the parse tree
	 */
	void enterExpr_8(RustParser.Expr_8Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_8}.
	 * @param ctx the parse tree
	 */
	void exitExpr_8(RustParser.Expr_8Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_9}.
	 * @param ctx the parse tree
	 */
	void enterExpr_9(RustParser.Expr_9Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_9}.
	 * @param ctx the parse tree
	 */
	void exitExpr_9(RustParser.Expr_9Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_10}.
	 * @param ctx the parse tree
	 */
	void enterExpr_10(RustParser.Expr_10Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_10}.
	 * @param ctx the parse tree
	 */
	void exitExpr_10(RustParser.Expr_10Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_11}.
	 * @param ctx the parse tree
	 */
	void enterExpr_11(RustParser.Expr_11Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_11}.
	 * @param ctx the parse tree
	 */
	void exitExpr_11(RustParser.Expr_11Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_12}.
	 * @param ctx the parse tree
	 */
	void enterExpr_12(RustParser.Expr_12Context ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_12}.
	 * @param ctx the parse tree
	 */
	void exitExpr_12(RustParser.Expr_12Context ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(RustParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(RustParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_dot_or_call}.
	 * @param ctx the parse tree
	 */
	void enterExpr_dot_or_call(RustParser.Expr_dot_or_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_dot_or_call}.
	 * @param ctx the parse tree
	 */
	void exitExpr_dot_or_call(RustParser.Expr_dot_or_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_bottom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bottom(RustParser.Expr_bottomContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_bottom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bottom(RustParser.Expr_bottomContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_RL(RustParser.Expr_RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_RL(RustParser.Expr_RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_1RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_1RL(RustParser.Expr_1RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_1RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_1RL(RustParser.Expr_1RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_2RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_2RL(RustParser.Expr_2RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_2RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_2RL(RustParser.Expr_2RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_3RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_3RL(RustParser.Expr_3RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_3RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_3RL(RustParser.Expr_3RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_4RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_4RL(RustParser.Expr_4RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_4RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_4RL(RustParser.Expr_4RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_5RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_5RL(RustParser.Expr_5RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_5RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_5RL(RustParser.Expr_5RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_6RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_6RL(RustParser.Expr_6RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_6RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_6RL(RustParser.Expr_6RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_7RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_7RL(RustParser.Expr_7RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_7RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_7RL(RustParser.Expr_7RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_8RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_8RL(RustParser.Expr_8RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_8RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_8RL(RustParser.Expr_8RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_9RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_9RL(RustParser.Expr_9RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_9RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_9RL(RustParser.Expr_9RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_10RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_10RL(RustParser.Expr_10RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_10RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_10RL(RustParser.Expr_10RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_11RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_11RL(RustParser.Expr_11RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_11RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_11RL(RustParser.Expr_11RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_12RL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_12RL(RustParser.Expr_12RLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_12RL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_12RL(RustParser.Expr_12RLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_prefixRL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefixRL(RustParser.Expr_prefixRLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_prefixRL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefixRL(RustParser.Expr_prefixRLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_dot_or_callRL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_dot_or_callRL(RustParser.Expr_dot_or_callRLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_dot_or_callRL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_dot_or_callRL(RustParser.Expr_dot_or_callRLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_bottomRL}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bottomRL(RustParser.Expr_bottomRLContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_bottomRL}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bottomRL(RustParser.Expr_bottomRLContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_RB}.
	 * @param ctx the parse tree
	 */
	void enterExpr_RB(RustParser.Expr_RBContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_RB}.
	 * @param ctx the parse tree
	 */
	void exitExpr_RB(RustParser.Expr_RBContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_RBB}.
	 * @param ctx the parse tree
	 */
	void enterExpr_RBB(RustParser.Expr_RBBContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_RBB}.
	 * @param ctx the parse tree
	 */
	void exitExpr_RBB(RustParser.Expr_RBBContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_2RBB}.
	 * @param ctx the parse tree
	 */
	void enterExpr_2RBB(RustParser.Expr_2RBBContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_2RBB}.
	 * @param ctx the parse tree
	 */
	void exitExpr_2RBB(RustParser.Expr_2RBBContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_3RBB}.
	 * @param ctx the parse tree
	 */
	void enterExpr_3RBB(RustParser.Expr_3RBBContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_3RBB}.
	 * @param ctx the parse tree
	 */
	void exitExpr_3RBB(RustParser.Expr_3RBBContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_4RBB}.
	 * @param ctx the parse tree
	 */
	void enterExpr_4RBB(RustParser.Expr_4RBBContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_4RBB}.
	 * @param ctx the parse tree
	 */
	void exitExpr_4RBB(RustParser.Expr_4RBBContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_5RBB}.
	 * @param ctx the parse tree
	 */
	void enterExpr_5RBB(RustParser.Expr_5RBBContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_5RBB}.
	 * @param ctx the parse tree
	 */
	void exitExpr_5RBB(RustParser.Expr_5RBBContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(RustParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(RustParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt_block(RustParser.Expr_stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt_block(RustParser.Expr_stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_stmt_not_block}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt_not_block(RustParser.Expr_stmt_not_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_stmt_not_block}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt_not_block(RustParser.Expr_stmt_not_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#field_inits}.
	 * @param ctx the parse tree
	 */
	void enterField_inits(RustParser.Field_initsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#field_inits}.
	 * @param ctx the parse tree
	 */
	void exitField_inits(RustParser.Field_initsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#default_field_inits}.
	 * @param ctx the parse tree
	 */
	void enterDefault_field_inits(RustParser.Default_field_initsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#default_field_inits}.
	 * @param ctx the parse tree
	 */
	void exitDefault_field_inits(RustParser.Default_field_initsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#field_init}.
	 * @param ctx the parse tree
	 */
	void enterField_init(RustParser.Field_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#field_init}.
	 * @param ctx the parse tree
	 */
	void exitField_init(RustParser.Field_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_vector}.
	 * @param ctx the parse tree
	 */
	void enterExpr_vector(RustParser.Expr_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_vector}.
	 * @param ctx the parse tree
	 */
	void exitExpr_vector(RustParser.Expr_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_if}.
	 * @param ctx the parse tree
	 */
	void enterExpr_if(RustParser.Expr_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_if}.
	 * @param ctx the parse tree
	 */
	void exitExpr_if(RustParser.Expr_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#block_or_if}.
	 * @param ctx the parse tree
	 */
	void enterBlock_or_if(RustParser.Block_or_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#block_or_if}.
	 * @param ctx the parse tree
	 */
	void exitBlock_or_if(RustParser.Block_or_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_for}.
	 * @param ctx the parse tree
	 */
	void enterExpr_for(RustParser.Expr_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_for}.
	 * @param ctx the parse tree
	 */
	void exitExpr_for(RustParser.Expr_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_do}.
	 * @param ctx the parse tree
	 */
	void enterExpr_do(RustParser.Expr_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_do}.
	 * @param ctx the parse tree
	 */
	void exitExpr_do(RustParser.Expr_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_while}.
	 * @param ctx the parse tree
	 */
	void enterExpr_while(RustParser.Expr_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_while}.
	 * @param ctx the parse tree
	 */
	void exitExpr_while(RustParser.Expr_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_loop}.
	 * @param ctx the parse tree
	 */
	void enterExpr_loop(RustParser.Expr_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_loop}.
	 * @param ctx the parse tree
	 */
	void exitExpr_loop(RustParser.Expr_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_match}.
	 * @param ctx the parse tree
	 */
	void enterExpr_match(RustParser.Expr_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_match}.
	 * @param ctx the parse tree
	 */
	void exitExpr_match(RustParser.Expr_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#match_clauses}.
	 * @param ctx the parse tree
	 */
	void enterMatch_clauses(RustParser.Match_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#match_clauses}.
	 * @param ctx the parse tree
	 */
	void exitMatch_clauses(RustParser.Match_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#match_final_clause}.
	 * @param ctx the parse tree
	 */
	void enterMatch_final_clause(RustParser.Match_final_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#match_final_clause}.
	 * @param ctx the parse tree
	 */
	void exitMatch_final_clause(RustParser.Match_final_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#match_clause}.
	 * @param ctx the parse tree
	 */
	void enterMatch_clause(RustParser.Match_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#match_clause}.
	 * @param ctx the parse tree
	 */
	void exitMatch_clause(RustParser.Match_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_lambda}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lambda(RustParser.Expr_lambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_lambda}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lambda(RustParser.Expr_lambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(RustParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(RustParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lifetime}.
	 * @param ctx the parse tree
	 */
	void enterLifetime(RustParser.LifetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lifetime}.
	 * @param ctx the parse tree
	 */
	void exitLifetime(RustParser.LifetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(RustParser.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(RustParser.MacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#macro_parens}.
	 * @param ctx the parse tree
	 */
	void enterMacro_parens(RustParser.Macro_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#macro_parens}.
	 * @param ctx the parse tree
	 */
	void exitMacro_parens(RustParser.Macro_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#macro_braces}.
	 * @param ctx the parse tree
	 */
	void enterMacro_braces(RustParser.Macro_bracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#macro_braces}.
	 * @param ctx the parse tree
	 */
	void exitMacro_braces(RustParser.Macro_bracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#path_with_tps}.
	 * @param ctx the parse tree
	 */
	void enterPath_with_tps(RustParser.Path_with_tpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#path_with_tps}.
	 * @param ctx the parse tree
	 */
	void exitPath_with_tps(RustParser.Path_with_tpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#path_with_colon_tps}.
	 * @param ctx the parse tree
	 */
	void enterPath_with_colon_tps(RustParser.Path_with_colon_tpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#path_with_colon_tps}.
	 * @param ctx the parse tree
	 */
	void exitPath_with_colon_tps(RustParser.Path_with_colon_tpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lit}.
	 * @param ctx the parse tree
	 */
	void enterLit(RustParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lit}.
	 * @param ctx the parse tree
	 */
	void exitLit(RustParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#tt}.
	 * @param ctx the parse tree
	 */
	void enterTt(RustParser.TtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#tt}.
	 * @param ctx the parse tree
	 */
	void exitTt(RustParser.TtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#delimited}.
	 * @param ctx the parse tree
	 */
	void enterDelimited(RustParser.DelimitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#delimited}.
	 * @param ctx the parse tree
	 */
	void exitDelimited(RustParser.DelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#parendelim}.
	 * @param ctx the parse tree
	 */
	void enterParendelim(RustParser.ParendelimContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#parendelim}.
	 * @param ctx the parse tree
	 */
	void exitParendelim(RustParser.ParendelimContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#bracketdelim}.
	 * @param ctx the parse tree
	 */
	void enterBracketdelim(RustParser.BracketdelimContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#bracketdelim}.
	 * @param ctx the parse tree
	 */
	void exitBracketdelim(RustParser.BracketdelimContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#bracedelim}.
	 * @param ctx the parse tree
	 */
	void enterBracedelim(RustParser.BracedelimContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#bracedelim}.
	 * @param ctx the parse tree
	 */
	void exitBracedelim(RustParser.BracedelimContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#non_delimiter}.
	 * @param ctx the parse tree
	 */
	void enterNon_delimiter(RustParser.Non_delimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#non_delimiter}.
	 * @param ctx the parse tree
	 */
	void exitNon_delimiter(RustParser.Non_delimiterContext ctx);
}