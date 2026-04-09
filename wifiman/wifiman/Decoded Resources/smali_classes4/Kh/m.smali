.class LKh/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LKh/n;


# direct methods
.method public constructor <init>(LKh/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKh/m;->a:LKh/n;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKh/m;->a:LKh/n;

    invoke-static {v0}, LKh/n;->h(LKh/n;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
