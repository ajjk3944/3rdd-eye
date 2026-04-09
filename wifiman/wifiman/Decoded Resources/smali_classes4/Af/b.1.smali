.class public final LAf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDe/a;


# static fields
.field public static final a:LAf/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LAf/b;

    invoke-direct {v0}, LAf/b;-><init>()V

    sput-object v0, LAf/b;->a:LAf/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ls9/d;
    .locals 2

    new-instance v0, Ls9/d$b;

    sget v1, Lm8/c;->B4:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    return-object v0
.end method

.method public b(LT/l;I)J
    .locals 3

    const v0, -0x132afb4c

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.ValueSelectedBadge.color (ValueSelectedBadge.kt:14)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->d()Lr9/a$a;

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

.method public c(LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LDe/a$a;->a(LDe/a;LT/l;I)V

    return-void
.end method

.method public d()Z
    .locals 1

    invoke-static {p0}, LDe/a$a;->b(LDe/a;)Z

    move-result v0

    return v0
.end method
