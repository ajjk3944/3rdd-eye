.class LNh/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LNh/T;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LNh/T;

    invoke-direct {v0}, LNh/T;-><init>()V

    sput-object v0, LNh/T;->a:LNh/T;

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

    check-cast p1, LBh/f0;

    invoke-static {p1}, LNh/U;->s(LBh/f0;)LBh/a;

    move-result-object p1

    return-object p1
.end method
