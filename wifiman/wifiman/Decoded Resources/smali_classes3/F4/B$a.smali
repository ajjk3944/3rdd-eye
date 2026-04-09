.class LF4/B$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF4/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Ld5/c;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ld5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF4/B$a;->a:Ljava/util/Set;

    iput-object p2, p0, LF4/B$a;->b:Ld5/c;

    return-void
.end method
