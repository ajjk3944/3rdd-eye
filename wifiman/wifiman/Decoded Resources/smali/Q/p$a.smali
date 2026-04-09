.class final LQ/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/y0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/p;->a(Ly/k;)LE0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/p;


# direct methods
.method constructor <init>(LQ/p;)V
    .locals 0

    iput-object p1, p0, LQ/p$a;->a:LQ/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, LQ/p$a;->a:LQ/p;

    invoke-static {v0}, LQ/p;->c(LQ/p;)J

    move-result-wide v0

    return-wide v0
.end method
