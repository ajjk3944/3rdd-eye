.class final LD8/x$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/x;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LD8/x$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/x$d;

    invoke-direct {v0}, LD8/x$d;-><init>()V

    sput-object v0, LD8/x$d;->a:LD8/x$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lsd/a$a;Ljava/lang/Boolean;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "advancedSpeedtestAvailability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "advancedTestEnabled"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lsd/a$a$a;

    if-eqz v0, :cond_0

    new-instance p1, Ll9/a;

    invoke-direct {p1, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lsd/a$a$b;

    if-eqz p1, :cond_1

    new-instance p1, Ll9/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lsd/a$a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, LD8/x$d;->a(Lsd/a$a;Ljava/lang/Boolean;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
