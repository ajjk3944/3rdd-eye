.class public final synthetic Lm2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/room/d;

.field public final synthetic b:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/d;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/o;->a:Landroidx/room/d;

    iput-object p2, p0, Lm2/o;->b:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm2/o;->a:Landroidx/room/d;

    iget-object v1, p0, Lm2/o;->b:[Ljava/lang/String;

    invoke-static {v0, v1}, Landroidx/room/d$b;->c(Landroidx/room/d;[Ljava/lang/String;)V

    return-void
.end method
