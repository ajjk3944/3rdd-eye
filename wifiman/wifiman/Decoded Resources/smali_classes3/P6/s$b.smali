.class LP6/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/s;->j1(LP6/x;Lgg/y;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LP6/x;


# direct methods
.method constructor <init>(LP6/x;)V
    .locals 0

    iput-object p1, p0, LP6/s$b;->a:LP6/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Long;)Z
    .locals 0

    iget-object p1, p0, LP6/s$b;->a:LP6/x;

    invoke-interface {p1}, LP6/x;->b()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LP6/s$b;->a(Ljava/lang/Long;)Z

    move-result p1

    return p1
.end method
