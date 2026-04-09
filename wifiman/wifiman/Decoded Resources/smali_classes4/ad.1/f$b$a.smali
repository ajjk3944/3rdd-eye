.class final Lad/f$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lad/f$b;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lad/f;

.field final synthetic b:Landroid/net/Network;


# direct methods
.method constructor <init>(Lad/f;Landroid/net/Network;)V
    .locals 0

    iput-object p1, p0, Lad/f$b$a;->a:Lad/f;

    iput-object p2, p0, Lad/f$b$a;->b:Landroid/net/Network;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 3

    const-string v0, "hostname"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lad/f$b$a;->a:Lad/f;

    invoke-static {v0}, Lad/f;->c(Lad/f;)Lad/a;

    move-result-object v0

    const/16 v1, 0x1770

    iget-object v2, p0, Lad/f$b$a;->b:Landroid/net/Network;

    invoke-interface {v0, p1, v1, v2}, Lad/a;->a(Ljava/lang/String;ILandroid/net/Network;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lad/f$b$a;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
