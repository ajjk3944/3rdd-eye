.class public final Ly5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LA5/h;

.field private final b:LD3/F;


# direct methods
.method public constructor <init>(LA5/h;)V
    .locals 1

    const-string/jumbo v0, "common"

    invoke-static {v0}, LD3/N;->b(Ljava/lang/String;)LD3/F;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/a;->a:LA5/h;

    iput-object v0, p0, Ly5/a;->b:LD3/F;

    return-void
.end method
