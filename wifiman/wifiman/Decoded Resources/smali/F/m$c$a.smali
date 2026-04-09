.class public final LF/m$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m$c;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/G;


# direct methods
.method public constructor <init>(LM/G;)V
    .locals 0

    iput-object p1, p0, LF/m$c$a;->a:LM/G;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, LF/m$c$a;->a:LM/G;

    invoke-virtual {v0}, LM/G;->R()V

    return-void
.end method
