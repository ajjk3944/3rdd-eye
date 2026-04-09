.class public final Loa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loa/a$a;
    }
.end annotation


# instance fields
.field private final a:Loa/a$a;

.field private final b:LE/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Loa/a$a;LE/a;)V
    .locals 1

    const-string/jumbo v0, "corner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "card"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Loa/a;->a:Loa/a$a;

    .line 3
    iput-object p2, p0, Loa/a;->b:LE/a;

    return-void
.end method

.method public synthetic constructor <init>(Loa/a$a;LE/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    new-instance p1, Loa/a$a;

    const/4 p4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, p4, v1, v0}, Loa/a$a;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    invoke-virtual {p1}, Loa/a$a;->a()F

    move-result p2

    invoke-static {p2}, LE/h;->d(F)LE/g;

    move-result-object p2

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Loa/a;-><init>(Loa/a$a;LE/a;)V

    return-void
.end method


# virtual methods
.method public final a()LE/a;
    .locals 1

    iget-object v0, p0, Loa/a;->b:LE/a;

    return-object v0
.end method

.method public final b()Loa/a$a;
    .locals 1

    iget-object v0, p0, Loa/a;->a:Loa/a$a;

    return-object v0
.end method
