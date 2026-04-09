.class abstract Lqg/b;
.super Lgg/i;
.source "SourceFile"


# instance fields
.field protected final b:Lgg/i;


# direct methods
.method constructor <init>(Lgg/i;)V
    .locals 1

    invoke-direct {p0}, Lgg/i;-><init>()V

    const-string v0, "source is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lqg/b;->b:Lgg/i;

    return-void
.end method
