.class public final LI2/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:LI2/e$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LI2/e$c$a;

    invoke-direct {v0, p0}, LI2/e$c$a;-><init>(LI2/e$c;)V

    iput-object v0, p0, LI2/e$c;->a:LI2/e$a;

    return-void
.end method


# virtual methods
.method public d(LI2/r;)LI2/n;
    .locals 1

    new-instance p1, LI2/e;

    iget-object v0, p0, LI2/e$c;->a:LI2/e$a;

    invoke-direct {p1, v0}, LI2/e;-><init>(LI2/e$a;)V

    return-object p1
.end method
