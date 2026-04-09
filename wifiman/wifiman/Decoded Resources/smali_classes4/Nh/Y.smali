.class LNh/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/b$c;


# static fields
.field public static final a:LNh/Y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LNh/Y;

    invoke-direct {v0}, LNh/Y;-><init>()V

    sput-object v0, LNh/Y;->a:LNh/Y;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    check-cast p1, LBh/e;

    invoke-static {p1}, LNh/a0;->j0(LBh/e;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
