.class public final LVh/a;
.super LWh/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVh/a$a;
    }
.end annotation


# static fields
.field public static final g:LVh/a$a;

.field public static final h:LVh/a;

.field public static final i:LVh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LVh/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LVh/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LVh/a;->g:LVh/a$a;

    new-instance v0, LVh/a;

    const/4 v1, 0x7

    const/4 v2, 0x1

    const/4 v3, 0x0

    filled-new-array {v2, v3, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1}, LVh/a;-><init>([I)V

    sput-object v0, LVh/a;->h:LVh/a;

    new-instance v0, LVh/a;

    new-array v1, v3, [I

    invoke-direct {v0, v1}, LVh/a;-><init>([I)V

    sput-object v0, LVh/a;->i:LVh/a;

    return-void
.end method

.method public varargs constructor <init>([I)V
    .locals 1

    const-string v0, "numbers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-direct {p0, p1}, LWh/a;-><init>([I)V

    return-void
.end method


# virtual methods
.method public h()Z
    .locals 1

    sget-object v0, LVh/a;->h:LVh/a;

    invoke-virtual {p0, v0}, LWh/a;->f(LWh/a;)Z

    move-result v0

    return v0
.end method
