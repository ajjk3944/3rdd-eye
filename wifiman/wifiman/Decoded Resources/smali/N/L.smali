.class public abstract LN/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/r0;

.field private static final b:Lr/r0;

.field private static final c:Lr/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v6, Lr/r0;

    invoke-static {}, Lr/G;->c()Lr/E;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/16 v1, 0x78

    const/4 v2, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lr/r0;-><init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, LN/L;->a:Lr/r0;

    new-instance v0, Lr/r0;

    new-instance v10, Lr/x;

    const v1, 0x3ecccccd    # 0.4f

    const/4 v2, 0x0

    const v3, 0x3f19999a    # 0.6f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v10, v1, v2, v3, v4}, Lr/x;-><init>(FFFF)V

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/16 v8, 0x96

    const/4 v9, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lr/r0;-><init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/L;->b:Lr/r0;

    new-instance v0, Lr/r0;

    new-instance v5, Lr/x;

    invoke-direct {v5, v1, v2, v3, v4}, Lr/x;-><init>(FFFF)V

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/16 v14, 0x78

    const/4 v15, 0x0

    move-object v13, v0

    move-object/from16 v16, v5

    invoke-direct/range {v13 .. v18}, Lr/r0;-><init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/L;->c:Lr/r0;

    return-void
.end method

.method public static final synthetic a()Lr/r0;
    .locals 1

    sget-object v0, LN/L;->a:Lr/r0;

    return-object v0
.end method

.method public static final synthetic b()Lr/r0;
    .locals 1

    sget-object v0, LN/L;->b:Lr/r0;

    return-object v0
.end method

.method public static final synthetic c()Lr/r0;
    .locals 1

    sget-object v0, LN/L;->c:Lr/r0;

    return-object v0
.end method

.method public static final d(Lr/a;FLy/j;Ly/j;Ldh/e;)Ljava/lang/Object;
    .locals 8

    if-eqz p3, :cond_0

    sget-object p2, LN/K;->a:LN/K;

    invoke-virtual {p2, p3}, LN/K;->a(Ly/j;)Lr/i;

    move-result-object p2

    :goto_0
    move-object v2, p2

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    sget-object p3, LN/K;->a:LN/K;

    invoke-virtual {p3, p2}, LN/K;->b(Ly/j;)Lr/i;

    move-result-object p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_3

    invoke-static {p1}, LY0/h;->d(F)LY0/h;

    move-result-object v1

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v5, p4

    invoke-static/range {v0 .. v7}, Lr/a;->f(Lr/a;Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_3
    invoke-static {p1}, LY0/h;->d(F)LY0/h;

    move-result-object p1

    invoke-virtual {p0, p1, p4}, Lr/a;->t(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
