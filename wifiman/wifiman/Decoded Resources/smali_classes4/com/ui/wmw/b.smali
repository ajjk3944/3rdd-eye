.class public final synthetic Lcom/ui/wmw/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wmw/a;

.field public final synthetic b:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wmw/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/b;->a:Lcom/ui/wmw/a;

    iput-object p2, p0, Lcom/ui/wmw/b;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wmw/b;->a:Lcom/ui/wmw/a;

    iget-object v1, p0, Lcom/ui/wmw/b;->b:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lcom/ui/wmw/a$b$a$a;->a(Lcom/ui/wmw/a;Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
