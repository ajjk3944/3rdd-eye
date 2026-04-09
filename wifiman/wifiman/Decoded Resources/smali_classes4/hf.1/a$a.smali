.class final Lhf/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lhf/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhf/a$a;

    invoke-direct {v0}, Lhf/a$a;-><init>()V

    sput-object v0, Lhf/a$a;->a:Lhf/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;LT/l;I)V
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speedtest.component.ComposableSingletons$NetworkSpeedStringKt.lambda-1.<anonymous> (NetworkSpeedString.kt:180)"

    const v1, -0x5484d809

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p3, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object p1, LPe/a;->a:LPe/a;

    invoke-virtual {p1}, LPe/a;->N()Ls9/b;

    move-result-object p1

    const/4 p3, 0x6

    invoke-static {p1, p2, p3}, Lta/c;->i(Ls9/a$b;LT/l;I)Lr0/d;

    move-result-object v2

    new-instance p1, Ls9/d$b;

    sget v0, Lm8/c;->s3:I

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v3

    sget-object p1, Lff/a;->DOWN:Lff/a;

    invoke-static {p1, p2, p3}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v5

    const/16 v8, 0x180

    const/4 v9, 0x0

    move-object v7, p2

    invoke-static/range {v2 .. v9}, LN/a0;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lhf/a$a;->a(Ljava/lang/String;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
