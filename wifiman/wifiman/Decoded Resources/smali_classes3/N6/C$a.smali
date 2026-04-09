.class LN6/C$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN6/C;->a(LQ6/g;[LQ6/d;)LN6/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/w;

.field final synthetic b:Lgg/w;

.field final synthetic c:LN6/C;


# direct methods
.method constructor <init>(LN6/C;Lgg/w;Lgg/w;)V
    .locals 0

    iput-object p1, p0, LN6/C$a;->c:LN6/C;

    iput-object p2, p0, LN6/C$a;->a:Lgg/w;

    iput-object p3, p0, LN6/C$a;->b:Lgg/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/s;
    .locals 1

    iget-object v0, p0, LN6/C$a;->a:Lgg/w;

    invoke-virtual {p1, v0}, Lgg/s;->g(Lgg/w;)Lgg/s;

    move-result-object p1

    iget-object v0, p0, LN6/C$a;->b:Lgg/w;

    invoke-virtual {p1, v0}, Lgg/s;->g(Lgg/w;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lgg/s;)Lgg/v;
    .locals 0

    invoke-virtual {p0, p1}, LN6/C$a;->a(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
