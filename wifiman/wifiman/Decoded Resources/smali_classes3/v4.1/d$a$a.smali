.class public final Lv4/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lo4/l$b;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lo4/l$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/d$a$a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lv4/d$a$a;->b:Lo4/l$b;

    return-void
.end method
