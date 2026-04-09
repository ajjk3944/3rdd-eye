.class LN6/y$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN6/y$c;->a(Lgg/s;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LN6/y$c;


# direct methods
.method constructor <init>(LN6/y$c;)V
    .locals 0

    iput-object p1, p0, LN6/y$c$a;->a:LN6/y$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBg/b;)Lgg/s;
    .locals 1

    iget-object v0, p0, LN6/y$c$a;->a:LN6/y$c;

    iget-object v0, v0, LN6/y$c;->a:Lgg/w;

    invoke-virtual {p1, v0}, Lgg/s;->g(Lgg/w;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBg/b;

    invoke-virtual {p0, p1}, LN6/y$c$a;->a(LBg/b;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
