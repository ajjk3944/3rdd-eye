.class final Lm7/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lm7/d;


# direct methods
.method public constructor <init>(Lm7/d;)V
    .locals 0

    iput-object p1, p0, Lm7/d$c;->a:Lm7/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FF)V
    .locals 0

    iget-object p1, p0, Lm7/d$c;->a:Lm7/d;

    invoke-static {p1, p2}, Lm7/d;->g(Lm7/d;F)V

    return-void
.end method
