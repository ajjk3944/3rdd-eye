.class LJh/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LJh/P;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJh/P;

    invoke-direct {v0}, LJh/P;-><init>()V

    sput-object v0, LJh/P;->a:LJh/P;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBh/b;

    invoke-static {p1}, LJh/T;->a(LBh/b;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
