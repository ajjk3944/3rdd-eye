.class public final Landroidx/lifecycle/J;
.super Landroidx/lifecycle/N;
.source "SourceFile"


# instance fields
.field private final b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/N;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/J;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final X()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/J;->b:Ljava/util/Map;

    return-object v0
.end method
