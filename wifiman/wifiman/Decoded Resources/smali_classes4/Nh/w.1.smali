.class LNh/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LNh/z;


# direct methods
.method public constructor <init>(LNh/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/w;->a:LNh/z;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNh/w;->a:LNh/z;

    check-cast p1, LZh/f;

    invoke-static {v0, p1}, LNh/z;->p0(LNh/z;LZh/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
