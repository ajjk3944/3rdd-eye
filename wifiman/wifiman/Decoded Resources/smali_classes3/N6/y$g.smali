.class LN6/y$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN6/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LN6/y;


# direct methods
.method constructor <init>(LN6/y;)V
    .locals 0

    iput-object p1, p0, LN6/y$g;->a:LN6/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/s;
    .locals 1

    new-instance v0, LN6/y$g$a;

    invoke-direct {v0, p0}, LN6/y$g$a;-><init>(LN6/y$g;)V

    invoke-virtual {p1, v0}, Lgg/s;->s0(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lgg/s;)Lgg/v;
    .locals 0

    invoke-virtual {p0, p1}, LN6/y$g;->a(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
