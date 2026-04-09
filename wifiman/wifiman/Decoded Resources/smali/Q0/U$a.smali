.class public final LQ0/U$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ0/U;
.implements LT/z1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ0/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LQ0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LQ0/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ0/U$a;->a:LQ0/f;

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQ0/U$a;->a:LQ0/f;

    invoke-virtual {v0}, LQ0/f;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, LQ0/U$a;->a:LQ0/f;

    invoke-virtual {v0}, LQ0/f;->i()Z

    move-result v0

    return v0
.end method
