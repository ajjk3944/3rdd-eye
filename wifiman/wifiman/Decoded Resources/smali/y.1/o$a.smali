.class public final Ly/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ly/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly/o$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/o$a;->a:Ly/o$b;

    return-void
.end method


# virtual methods
.method public final a()Ly/o$b;
    .locals 1

    iget-object v0, p0, Ly/o$a;->a:Ly/o$b;

    return-object v0
.end method
