.class LNh/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LNh/W;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LNh/W;

    invoke-direct {v0}, LNh/W;-><init>()V

    sput-object v0, LNh/W;->a:LNh/W;

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

    check-cast p1, Lii/k;

    invoke-static {p1}, LNh/a0;->h0(Lii/k;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
