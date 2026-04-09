.class final LG8/b$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/b;->D0(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lq9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LG8/b$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG8/b$j;

    invoke-direct {v0}, LG8/b$j;-><init>()V

    sput-object v0, LG8/b$j;->a:LG8/b$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)J
    .locals 3

    const v0, 0x436ee969

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ubnt.usurvey.ui.sso.SSOAccountPickerVM.toViewModel.<anonymous> (SSOAccountPickerVM.kt:62)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LG8/b$j;->a(LT/l;I)J

    move-result-wide p1

    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    return-object p1
.end method
