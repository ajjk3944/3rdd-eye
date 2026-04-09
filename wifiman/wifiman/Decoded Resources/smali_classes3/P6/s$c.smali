.class LP6/s$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/s;->i1(LP6/G;Lgg/s;Lgg/s;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/s;


# direct methods
.method constructor <init>(Lgg/s;)V
    .locals 0

    iput-object p1, p0, LP6/s$c;->a:Lgg/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LG6/E$b;)Lgg/s;
    .locals 1

    sget-object v0, LG6/E$b;->c:LG6/E$b;

    if-eq p1, v0, :cond_0

    sget-object p1, LG6/G$a;->BLUETOOTH_NOT_ENABLED:LG6/G$a;

    invoke-static {p1}, Lgg/s;->h0(Ljava/lang/Object;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, LP6/s$c;->a:Lgg/s;

    new-instance v0, LP6/s$c$a;

    invoke-direct {v0, p0}, LP6/s$c$a;-><init>(LP6/s$c;)V

    invoke-virtual {p1, v0}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG6/E$b;

    invoke-virtual {p0, p1}, LP6/s$c;->a(LG6/E$b;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
