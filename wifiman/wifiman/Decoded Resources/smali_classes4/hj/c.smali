.class public Lhj/c;
.super Lhj/a;
.source "SourceFile"

# interfaces
.implements Lgj/b;
.implements Ljava/util/Iterator;


# static fields
.field public static final a:Lgj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhj/c;

    invoke-direct {v0}, Lhj/c;-><init>()V

    sput-object v0, Lhj/c;->a:Lgj/b;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhj/a;-><init>()V

    return-void
.end method

.method public static a()Lgj/b;
    .locals 1

    sget-object v0, Lhj/c;->a:Lgj/b;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic hasNext()Z
    .locals 1

    invoke-super {p0}, Lhj/a;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lhj/a;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic remove()V
    .locals 0

    invoke-super {p0}, Lhj/a;->remove()V

    return-void
.end method
