.class Lli/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lli/X;


# direct methods
.method public constructor <init>(Lli/X;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/V;->a:Lli/X;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lli/V;->a:Lli/X;

    check-cast p1, LUh/q;

    invoke-static {v0, p1}, Lli/X;->d(Lli/X;LUh/q;)LUh/q;

    move-result-object p1

    return-object p1
.end method
