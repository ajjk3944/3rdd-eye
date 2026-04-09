.class Le2/c$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field final a:Le2/c;

.field final b:[Ljava/lang/Object;


# direct methods
.method varargs constructor <init>(Le2/c;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/c$e;->a:Le2/c;

    iput-object p2, p0, Le2/c$e;->b:[Ljava/lang/Object;

    return-void
.end method
