.class final LLc/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu7/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLc/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lu7/a;
    .locals 1

    sget-object v0, Lw7/d;->a:Lw7/d;

    invoke-virtual {v0}, Lw7/d;->a()Lu7/a;

    move-result-object v0

    return-object v0
.end method
