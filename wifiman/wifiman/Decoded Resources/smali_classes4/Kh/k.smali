.class LKh/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LKh/l;


# direct methods
.method public constructor <init>(LKh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKh/k;->a:LKh/l;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKh/k;->a:LKh/l;

    invoke-static {v0}, LKh/l;->h(LKh/l;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
