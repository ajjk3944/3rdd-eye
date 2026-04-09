.class final LN/T0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/T0;->b(Ljava/lang/String;Lmh/p;ZZLR0/c0;Ly/k;ZLmh/p;Lmh/p;Lmh/p;Lmh/p;Lm0/i1;LN/S0;Lz/N;Lmh/p;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Z

.field final synthetic c:Ly/k;

.field final synthetic d:LN/S0;

.field final synthetic e:Lm0/i1;


# direct methods
.method constructor <init>(ZZLy/k;LN/S0;Lm0/i1;)V
    .locals 0

    iput-boolean p1, p0, LN/T0$b;->a:Z

    iput-boolean p2, p0, LN/T0$b;->b:Z

    iput-object p3, p0, LN/T0$b;->c:Ly/k;

    iput-object p4, p0, LN/T0$b;->d:LN/S0;

    iput-object p5, p0, LN/T0$b;->e:Lm0/i1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:673)"

    const v4, 0x7ffc7878

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v5, LN/T0;->a:LN/T0;

    iget-boolean v6, v0, LN/T0$b;->a:Z

    iget-boolean v7, v0, LN/T0$b;->b:Z

    iget-object v8, v0, LN/T0$b;->c:Ly/k;

    iget-object v9, v0, LN/T0$b;->d:LN/S0;

    iget-object v10, v0, LN/T0$b;->e:Lm0/i1;

    const/high16 v14, 0xc00000

    const/16 v15, 0x60

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v13, p1

    invoke-virtual/range {v5 .. v15}, LN/T0;->a(ZZLy/k;LN/S0;Lm0/i1;FFLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/T0$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
