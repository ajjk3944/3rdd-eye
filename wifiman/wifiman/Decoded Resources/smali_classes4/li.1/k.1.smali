.class Lli/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lli/l;


# direct methods
.method public constructor <init>(Lli/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/k;->a:Lli/l;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lli/k;->a:Lli/l;

    check-cast p1, Lli/l$a;

    invoke-static {v0, p1}, Lli/l;->b(Lli/l;Lli/l$a;)LBh/e;

    move-result-object p1

    return-object p1
.end method
