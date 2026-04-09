.class final LH8/l$b$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/l$b$a$b;->h()Ls9/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/l$b$a$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/l$b$a$b$a;

    invoke-direct {v0}, LH8/l$b$a$b$a;-><init>()V

    sput-object v0, LH8/l$b$a$b$a;->a:LH8/l$b$a$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(ILjava/lang/String;)Lvf/d$a;
    .locals 0

    invoke-static {p0, p1}, LH8/l$b$a$b$a;->c(ILjava/lang/String;)Lvf/d$a;

    move-result-object p0

    return-object p0
.end method

.method private static final c(ILjava/lang/String;)Lvf/d$a;
    .locals 1

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lvf/d$a;

    const-string/jumbo p1, "report"

    const-string v0, ""

    invoke-direct {p0, p1, v0}, Lvf/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 11

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2818181e

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ubnt.usurvey.ui.teleport.TeleportInvitationVM.State.Error.HostUnreachable.<get-message>.<anonymous> (TeleportInvitationVM.kt:306)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v3, Lvf/d;->a:Lvf/d;

    const p3, 0x7f110302

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string/jumbo p1, "getString(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget p1, Lvf/d;->b:I

    invoke-virtual {v3, p2, p1}, Lvf/d;->a(LT/l;I)J

    move-result-wide v5

    const p1, -0x560521c4

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_1

    new-instance p1, LH8/m;

    invoke-direct {p1}, LH8/m;-><init>()V

    invoke-interface {p2, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v8, p1

    check-cast v8, Lmh/p;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lvf/d;->d(Lvf/d;Ljava/lang/String;JLjava/lang/String;Lmh/p;ILjava/lang/Object;)LL0/d;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LH8/l$b$a$b$a;->b(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
