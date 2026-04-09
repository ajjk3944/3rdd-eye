.class public final Ly/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/j;


# instance fields
.field private final a:Ly/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/e;->a:Ly/d;

    return-void
.end method


# virtual methods
.method public final a()Ly/d;
    .locals 1

    iget-object v0, p0, Ly/e;->a:Ly/d;

    return-object v0
.end method
