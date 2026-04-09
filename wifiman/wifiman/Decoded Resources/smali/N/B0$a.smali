.class final LN/B0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/y0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/B0;->a(Ly/k;)LE0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/B0;


# direct methods
.method constructor <init>(LN/B0;)V
    .locals 0

    iput-object p1, p0, LN/B0$a;->a:LN/B0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, LN/B0$a;->a:LN/B0;

    invoke-static {v0}, LN/B0;->c(LN/B0;)J

    move-result-wide v0

    return-wide v0
.end method
