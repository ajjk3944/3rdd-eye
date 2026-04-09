.class public final LLh/d;
.super LLh/f;
.source "SourceFile"


# instance fields
.field private final F:LBh/f0;

.field private final G:LBh/f0;

.field private final H:LBh/Y;


# direct methods
.method public constructor <init>(LBh/e;LBh/f0;LBh/f0;LBh/Y;)V
    .locals 16

    move-object/from16 v12, p0

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    move-object/from16 v15, p4

    const-string v0, "ownerDescriptor"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getterMethod"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overriddenProperty"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, LBh/C;->l()LBh/D;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, LBh/C;->getVisibility()LBh/u;

    move-result-object v4

    if-eqz v14, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-interface/range {p4 .. p4}, LBh/I;->getName()LZh/f;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LBh/p;->j()LBh/g0;

    move-result-object v7

    sget-object v9, LBh/b$a;->DECLARATION:LBh/b$a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v11}, LLh/f;-><init>(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/g0;LBh/Y;LBh/b$a;ZLYg/s;)V

    iput-object v13, v12, LLh/d;->F:LBh/f0;

    iput-object v14, v12, LLh/d;->G:LBh/f0;

    iput-object v15, v12, LLh/d;->H:LBh/Y;

    return-void
.end method
