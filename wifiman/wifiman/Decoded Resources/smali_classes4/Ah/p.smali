.class LAh/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LZh/f;


# direct methods
.method public constructor <init>(LZh/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh/p;->a:LZh/f;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LAh/p;->a:LZh/f;

    check-cast p1, Lii/k;

    invoke-static {v0, p1}, LAh/u;->j(LZh/f;Lii/k;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
