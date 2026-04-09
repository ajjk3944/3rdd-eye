.class Lli/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lli/u;


# direct methods
.method public constructor <init>(Lli/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/s;->a:Lli/u;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lli/s;->a:Lli/u;

    check-cast p1, LZh/b;

    invoke-static {v0, p1}, Lli/u;->M0(Lli/u;LZh/b;)LBh/g0;

    move-result-object p1

    return-object p1
.end method
