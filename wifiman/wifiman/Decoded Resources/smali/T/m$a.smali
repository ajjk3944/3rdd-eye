.class final LT/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/V0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LT/m$b;


# direct methods
.method public constructor <init>(LT/m$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/m$a;->a:LT/m$b;

    return-void
.end method


# virtual methods
.method public final a()LT/m$b;
    .locals 1

    iget-object v0, p0, LT/m$a;->a:LT/m$b;

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LT/m$a;->a:LT/m$b;

    invoke-virtual {v0}, LT/m$b;->s()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LT/m$a;->a:LT/m$b;

    invoke-virtual {v0}, LT/m$b;->s()V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method
