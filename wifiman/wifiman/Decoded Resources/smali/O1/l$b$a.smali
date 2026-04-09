.class public final LO1/l$b$a;
.super LO1/l$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO1/l$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LO1/m;


# direct methods
.method public constructor <init>(LO1/m;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LO1/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LO1/l$b$a;->a:LO1/m;

    return-void
.end method


# virtual methods
.method public a()LO1/m;
    .locals 1

    iget-object v0, p0, LO1/l$b$a;->a:LO1/m;

    return-object v0
.end method
