.class public final Ly/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/j;


# instance fields
.field private final a:Ly/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/a;->a:Ly/b;

    return-void
.end method


# virtual methods
.method public final a()Ly/b;
    .locals 1

    iget-object v0, p0, Ly/a;->a:Ly/b;

    return-object v0
.end method
