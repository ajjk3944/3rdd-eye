.class final LM/H$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/H;->a(ZLW0/i;LM/G;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/G;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LM/G;Z)V
    .locals 0

    iput-object p1, p0, LM/H$a;->a:LM/G;

    iput-boolean p2, p0, LM/H$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, LM/H$a;->a:LM/G;

    iget-boolean v1, p0, LM/H$a;->b:Z

    invoke-virtual {v0, v1}, LM/G;->G(Z)J

    move-result-wide v0

    return-wide v0
.end method
