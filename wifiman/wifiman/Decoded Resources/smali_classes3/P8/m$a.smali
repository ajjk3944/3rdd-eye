.class final LP8/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/m;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/m$a;

    invoke-direct {v0}, LP8/m$a;-><init>()V

    sput-object v0, LP8/m$a;->a:LP8/m$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LP8/f$b;)LIf/a;
    .locals 1

    const-string/jumbo v0, "popupState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LP8/f$b$b;

    if-eqz v0, :cond_0

    check-cast p1, LP8/f$b$b;

    invoke-virtual {p1}, LP8/f$b$b;->a()LIf/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, LP8/f$b$a;

    if-eqz p1, :cond_1

    sget-object p1, LIf/a;->LOADING:LIf/a;

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LP8/f$b;

    invoke-virtual {p0, p1}, LP8/m$a;->a(LP8/f$b;)LIf/a;

    move-result-object p1

    return-object p1
.end method
