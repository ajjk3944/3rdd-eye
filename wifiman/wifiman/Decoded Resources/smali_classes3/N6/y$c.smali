.class LN6/y$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN6/y;->f(Lgg/w;)Lgg/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/w;


# direct methods
.method constructor <init>(Lgg/w;)V
    .locals 0

    iput-object p1, p0, LN6/y$c;->a:Lgg/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/s;
    .locals 1

    new-instance v0, LN6/y$c$b;

    invoke-direct {v0, p0}, LN6/y$c$b;-><init>(LN6/y$c;)V

    invoke-virtual {p1, v0}, Lgg/s;->d0(Lkg/n;)Lgg/s;

    move-result-object p1

    new-instance v0, LN6/y$c$a;

    invoke-direct {v0, p0}, LN6/y$c$a;-><init>(LN6/y$c;)V

    invoke-virtual {p1, v0}, Lgg/s;->Q(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lgg/s;)Lgg/v;
    .locals 0

    invoke-virtual {p0, p1}, LN6/y$c;->a(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
