.class final Lda/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/b;->b(Landroidx/compose/ui/e;Lda/u$a;Ljava/util/List;Lmh/a;LLi/g;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lda/u$a;

.field final synthetic b:Ljava/util/List;


# direct methods
.method constructor <init>(Lda/u$a;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lda/b$a;->a:Lda/u$a;

    iput-object p2, p0, Lda/b$a;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lmh/a;LT/l;I)V
    .locals 11

    const-string v0, "$unused$var$"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "dismissalAction"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.sso.register.PasswordStrengthComponent.<anonymous> (PasswordStrengthComponent.kt:142)"

    const v1, 0x2fafaaae

    invoke-static {v1, p4, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v2, Ly9/f;->BOTTOM:Ly9/f;

    new-instance p1, Lda/b$a$a;

    iget-object v0, p0, Lda/b$a;->a:Lda/u$a;

    iget-object v1, p0, Lda/b$a;->b:Ljava/util/List;

    invoke-direct {p1, v0, v1, p2}, Lda/b$a$a;-><init>(Lda/u$a;Ljava/util/List;Lmh/a;)V

    const/16 v0, 0x36

    const v1, -0x622d10bf

    const/4 v3, 0x1

    invoke-static {v1, v3, p1, p3, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    shl-int/lit8 p1, p4, 0x6

    and-int/lit16 p1, p1, 0x1c00

    or-int/lit16 v9, p1, 0x6006

    const/4 v10, 0x6

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    move-object v8, p3

    invoke-static/range {v2 .. v10}, Ly9/s;->b(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lmh/a;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lda/b$a;->a(Ljava/lang/Object;Lmh/a;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
