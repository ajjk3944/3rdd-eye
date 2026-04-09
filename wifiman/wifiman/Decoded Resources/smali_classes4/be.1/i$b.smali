.class final Lbe/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbe/i;-><init>(LZc/f;Lbe/c$a;LP7/a;Lcom/ui/wifiman/model/teleport/TeleportConnection;LFd/D;Lcom/ui/wifiman/model/support/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbe/i;


# direct methods
.method constructor <init>(Lbe/i;)V
    .locals 0

    iput-object p1, p0, Lbe/i$b;->a:Lbe/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lbe/i$b;->c()V

    return-void
.end method

.method private static final c()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Unifi api check ended"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lbe/i$b;->b(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;)LDj/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbe/c$b;

    iget-object v0, p0, Lbe/i$b;->a:Lbe/i;

    invoke-static {v0, p1}, Lbe/i;->h(Lbe/i;Lbe/c$b;)Lgg/z;

    move-result-object p1

    sget-object v0, Lbe/i$b$a;->a:Lbe/i$b$a;

    invoke-virtual {p1, v0}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    sget-object v0, Lbe/i$b$b;->a:Lbe/i$b$b;

    invoke-virtual {p1, v0}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lbe/i$b$c;->a:Lbe/i$b$c;

    invoke-virtual {p1, v0}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v0, Lbe/j;

    invoke-direct {v0}, Lbe/j;-><init>()V

    invoke-virtual {p1, v0}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    sget-object v0, Lbe/i$b$d;->a:Lbe/i$b$d;

    invoke-virtual {p1, v0}, Lgg/i;->R1(Lkg/p;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
