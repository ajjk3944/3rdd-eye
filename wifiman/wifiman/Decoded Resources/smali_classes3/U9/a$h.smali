.class final LU9/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LU9/a$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU9/a$h;

    invoke-direct {v0}, LU9/a$h;-><init>()V

    sput-object v0, LU9/a$h;->a:LU9/a$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/b;Lf2/k;LT/l;I)V
    .locals 7

    const-string v0, "$this$composable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.sso.mfa.ComposableSingletons$UiMFAKt.lambda-2.<anonymous> (UiMFA.kt:213)"

    const v1, 0x41fef442

    invoke-static {v1, p4, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 p1, p4, 0x3

    and-int/lit8 p1, p1, 0xe

    const-class p4, LX9/h;

    invoke-static {p2, p4, p3, p1}, LQ9/h;->l(Lf2/k;Ljava/lang/Class;LT/l;I)LR9/a;

    move-result-object p1

    move-object v0, p1

    check-cast v0, LX9/p;

    sget-object v1, Lu9/d;->MFA:Lu9/d;

    const/16 v5, 0x30

    const/16 v6, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p3

    invoke-static/range {v0 .. v6}, LX9/o;->b(LX9/p;Lu9/d;ZLCi/e;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, Lf2/k;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LU9/a$h;->a(Lq/b;Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
