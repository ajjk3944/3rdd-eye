.class final LE8/F$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/F;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/F$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/F$h;

    invoke-direct {v0}, LE8/F$h;-><init>()V

    sput-object v0, LE8/F$h;->a:LE8/F$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LE8/F$b;)Lkf/a;
    .locals 1

    const-string/jumbo v0, "cnt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LE8/F$b$b;

    if-eqz v0, :cond_0

    sget-object p1, Lkf/a$a;->a:Lkf/a$a;

    goto :goto_0

    :cond_0
    instance-of v0, p1, LE8/F$b$a;

    if-eqz v0, :cond_1

    check-cast p1, LE8/F$b$a;

    invoke-virtual {p1}, LE8/F$b$a;->a()Lkf/a$b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE8/F$b;

    invoke-virtual {p0, p1}, LE8/F$h;->a(LE8/F$b;)Lkf/a;

    move-result-object p1

    return-object p1
.end method
